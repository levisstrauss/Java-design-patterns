package Choice2.memento;

public class Editor {

  private String EditorContent;

  public EditorState createState() {
    return new EditorState(EditorContent);
  }

  public void restore(EditorState state) {
    EditorContent = state.getContent();
  }

  public String getContent() {
    return EditorContent;
  }

  public void setContent(String content) {
    this.EditorContent = content;
  }
}
