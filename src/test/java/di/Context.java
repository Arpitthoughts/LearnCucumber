package di;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String,String> stepData;

        public Context(){
        stepData=new HashMap<>();
        }

    public void setContext(String Key,String Value){
        stepData.put(Key,Value);
    }

    public String getContext(String Key){
        return stepData.get(Key);
    }
}
