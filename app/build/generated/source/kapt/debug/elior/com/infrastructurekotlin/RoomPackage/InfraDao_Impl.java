package elior.com.infrastructurekotlin.RoomPackage;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InfraDao_Impl implements InfraDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InfraModelRoom> __insertionAdapterOfInfraModelRoom;

  private final EntityDeletionOrUpdateAdapter<InfraModelRoom> __updateAdapterOfInfraModelRoom;

  private final SharedSQLiteStatement __preparedStmtOfDeleteInfra;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public InfraDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInfraModelRoom = new EntityInsertionAdapter<InfraModelRoom>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `InfraStructureKotlin` (`name`,`overview`,`poster_path`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InfraModelRoom value) {
        if (value.getInfraName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getInfraName());
        }
        if (value.getInfraOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getInfraOverview());
        }
        if (value.getInfraPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getInfraPosterPath());
        }
      }
    };
    this.__updateAdapterOfInfraModelRoom = new EntityDeletionOrUpdateAdapter<InfraModelRoom>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `InfraStructureKotlin` SET `name` = ?,`overview` = ?,`poster_path` = ? WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InfraModelRoom value) {
        if (value.getInfraName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getInfraName());
        }
        if (value.getInfraOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getInfraOverview());
        }
        if (value.getInfraPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getInfraPosterPath());
        }
        if (value.getInfraName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getInfraName());
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
  public void insert(final InfraModelRoom infraModelRoom) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfInfraModelRoom.insert(infraModelRoom);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final InfraModelRoom infraModelRoom) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfInfraModelRoom.handle(infraModelRoom);
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
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<InfraModelRoom>> getInfras() {
    final String _sql = "SELECT * from InfraStructureKotlin";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"InfraStructureKotlin"}, false, new Callable<List<InfraModelRoom>>() {
      @Override
      public List<InfraModelRoom> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfInfraName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfInfraOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfInfraPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final List<InfraModelRoom> _result = new ArrayList<InfraModelRoom>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final InfraModelRoom _item;
            final String _tmpInfraName;
            _tmpInfraName = _cursor.getString(_cursorIndexOfInfraName);
            final String _tmpInfraOverview;
            _tmpInfraOverview = _cursor.getString(_cursorIndexOfInfraOverview);
            final String _tmpInfraPosterPath;
            _tmpInfraPosterPath = _cursor.getString(_cursorIndexOfInfraPosterPath);
            _item = new InfraModelRoom(_tmpInfraName,_tmpInfraOverview,_tmpInfraPosterPath);
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
