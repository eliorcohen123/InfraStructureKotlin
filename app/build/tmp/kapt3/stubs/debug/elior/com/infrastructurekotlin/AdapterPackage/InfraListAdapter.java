package elior.com.infrastructurekotlin.AdapterPackage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lelior/com/infrastructurekotlin/AdapterPackage/InfraListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lelior/com/infrastructurekotlin/AdapterPackage/InfraListAdapter$InfraViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lelior/com/infrastructurekotlin/DataPackage/MovieModel;", "(Landroid/content/Context;Ljava/util/List;)V", "inflater", "Landroid/view/LayoutInflater;", "infra", "infraViewModel", "Lelior/com/infrastructurekotlin/RoomPackage/InfraViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "InfraViewHolder", "app_debug"})
public final class InfraListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<elior.com.infrastructurekotlin.AdapterPackage.InfraListAdapter.InfraViewHolder> {
    private final android.view.LayoutInflater inflater = null;
    private java.util.List<elior.com.infrastructurekotlin.DataPackage.MovieModel> infra;
    private elior.com.infrastructurekotlin.RoomPackage.InfraViewModel infraViewModel;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public elior.com.infrastructurekotlin.AdapterPackage.InfraListAdapter.InfraViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    elior.com.infrastructurekotlin.AdapterPackage.InfraListAdapter.InfraViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public InfraListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<elior.com.infrastructurekotlin.DataPackage.MovieModel> dataList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lelior/com/infrastructurekotlin/AdapterPackage/InfraListAdapter$InfraViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lelior/com/infrastructurekotlin/AdapterPackage/InfraListAdapter;Landroid/view/View;)V", "infraItemViewImage", "Landroid/widget/ImageView;", "getInfraItemViewImage", "()Landroid/widget/ImageView;", "infraItemViewOverview", "Landroid/widget/TextView;", "getInfraItemViewOverview", "()Landroid/widget/TextView;", "infraItemViewTitle", "getInfraItemViewTitle", "infraLinear", "Landroid/widget/LinearLayout;", "getInfraLinear", "()Landroid/widget/LinearLayout;", "app_debug"})
    public final class InfraViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView infraItemViewTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView infraItemViewOverview = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView infraItemViewImage = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout infraLinear = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getInfraItemViewTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getInfraItemViewOverview() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getInfraItemViewImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getInfraLinear() {
            return null;
        }
        
        public InfraViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}