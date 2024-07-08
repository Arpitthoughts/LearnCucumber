package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
    int count=0, maxcount=1;
    @Override
    public boolean retry(ITestResult iTestResult) {

        if(count<maxcount){
            count++;
            return true;
        }

        return false;
    }
}
