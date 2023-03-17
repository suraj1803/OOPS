package inheritanceDemo;

public abstract class UIControl {
  protected boolean isEnabled = true;

  public UIControl() {
    this(true);
  }

  public UIControl(boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public abstract void render();

  public void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}
