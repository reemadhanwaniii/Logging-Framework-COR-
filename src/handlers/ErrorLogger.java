package handlers;

import enums.LogLevel;
import model.LogRequest;

public class ErrorLogger extends BaseLogger{

  public ErrorLogger() {
      super(LogLevel.ERROR);
  }


    @Override
    protected void write(LogRequest request) {
        System.out.println("[Error] : "+request.getMessage());
    }
}
