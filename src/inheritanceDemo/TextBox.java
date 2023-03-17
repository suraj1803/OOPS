package inheritanceDemo;

public class TextBox extends UIControl {
  public String text;

  public TextBox() {
    super(true); // this should be very first statement
    text = "";
  }

  @Override
  public void render() {
    System.out.println("Render TextBox");
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }

  @Override
  public String toString() {
   return text;
  }
}
