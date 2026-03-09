package handlers;

import enums.LogLevel;
import model.LogRequest;

public class WarnLogger extends BaseLogger{

   public WarnLogger(Logger next) {
       super(LogLevel.WARN,next);
   }


    @Override
    protected void write(LogRequest request) {
        System.out.println(" [WARN] : "+request.getMessage());
    }
}
