package Choice2.mediator;

public class Button extends UIControl {
  private boolean isEnabled;

  public boolean isEnabled() {
    return isEnabled;
  }

  public void setEnabled(boolean enabled) {
    isEnabled = enabled;
    notifyEventHandlers();
  }
}
