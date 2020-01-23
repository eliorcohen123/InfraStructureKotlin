package elior.com.infrastructurekotlin.RoomPackage;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;

import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InfraDao_Impl implements InfraDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InfraModelRoom> __insertionAdapterOfInfraModel;

  private final EntityDeletionOrUpdateAdapter<InfraModelRoom> __updateAdapterOfInfraModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteInfra;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public InfraDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInfraModel = new EntityInsertionAdapter<InfraModelRoom>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `InfraStructureKotlin` (`name`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InfraModelRoom value) {
        if (value.getInfra() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getInfra());
        }
      }
    };
    this.__updateAdapterOfInfraModel = new EntityDeletionOrUpdateAdapter<InfraModelRoom>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `InfraStructureKotlin` SET `name` = ? WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InfraModelRoom value) {
        if (value.getInfra() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getInfra());
        }
        if (value.getInfra() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getInfra());
        }
      }
    };
    this.__preparedStmtOfDeleteInfra = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE From InfraStructureKotlin where name = name";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM InfraStructureKotlin";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final InfraModelRoom infraModelRoom, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfInfraModel.insert(infraModelRoom);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void update(final InfraModelRoom infraModelRoom) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfInfraModel.handle(infraModelRoom);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteInfra() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteInfra.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteInfra.release(_stmt);
    }
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<InfraModelRoom>> getInfras() {
    final String _sql = "SELECT * from InfraStructureKotlin ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"InfraStructureKotlin"}, false, new Callable<List<InfraModelRoom>>() {
      @Override
      public List<InfraModelRoom> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfInfra = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final List<InfraModelRoom> _result = new ArrayList<InfraModelRoom>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InfraModelRoom _item;
            final String _tmpInfra;
            _tmpInfra = _cursor.getString(_cursorIndexOfInfra);
            _item = new InfraModelRoom(_tmpInfra);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
