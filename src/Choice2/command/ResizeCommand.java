package Choice2.command;

import Choice2.command.editor.Command;

public class ResizeCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Resize");
  }
}
