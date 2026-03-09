package handlers;

import enums.LogLevel;
import model.LogRequest;

public class WarnLogger extends BaseLogger{

   public WarnLogger() {
       super(LogLevel.WARN);
   }


    @Override
    protected void write(LogRequest request) {
        System.out.println(" [WARN] : "+request.getMessage());
    }
}
