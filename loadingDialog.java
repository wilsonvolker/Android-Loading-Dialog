import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class loadingDialog extends Dialog {
    public loadingDialog(@NonNull Context context) {
        super(context);
    }

    public loadingDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected loadingDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public static class Builder{
        loadingDialog dialog = null;
        public void dismissDialog(){
            if(dialog != null){
                dialog.dismiss();
            }
        }

        public void create(Context context){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            dialog = new loadingDialog(context, R.style.Theme_AppCompat_Dialog);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); //Remove title
            View layout = inflater.inflate(R.layout.loading_dialog, null);

            dialog.setContentView(layout);
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();
        }
    }
}
