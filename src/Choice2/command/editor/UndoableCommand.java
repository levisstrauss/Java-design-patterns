package Choice2.command.editor;

public interface UndoableCommand extends Command {
  void unexecute();
}
