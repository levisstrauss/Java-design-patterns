package Choice2.memento;

public class EditorState {

  private final String EditorStateContent;

  public EditorState(String content) {
    this.EditorStateContent = content;
  }

  public String getContent() {
    return EditorStateContent;
  }
}
