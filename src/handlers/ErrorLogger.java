package handlers;

import enums.LogLevel;
import model.LogRequest;

public class ErrorLogger extends BaseLogger{

  public ErrorLogger(Logger next) {
      super(LogLevel.ERROR,next);
  }


    @Override
    protected void write(LogRequest request) {
        System.out.println("[Error] : "+request.getMessage());
    }
}
