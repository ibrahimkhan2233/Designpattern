
// Product interface
interface Button {
    void render();
    void onClick();
}

// Concrete Product
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button clicked");
    }
}

// Concrete Product
class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering HTML Button");
    }

    @Override
    public void onClick() {
        System.out.println("HTML Button clicked");
    }
}

// Creator abstract class
abstract class Dialog {
    public abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
}

// Concrete Creator
class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

// Concrete Creator
class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}

