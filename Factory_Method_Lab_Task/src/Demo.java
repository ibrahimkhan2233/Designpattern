import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Dialog> dialogs = new ArrayList<>();
        dialogs.add(new WindowsDialog());
        dialogs.add(new WebDialog());

        for (Dialog dialog : dialogs) {
            dialog.renderWindow();
        }
    }
}
