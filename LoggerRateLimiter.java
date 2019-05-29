
import java.util.*;

class LoggerRateLimiter {

    private Map<String,Integer> map = new HashMap<String,Integer>();

    /** Initialize your data structure here. */
    public LoggerRateLimiter() {
    }

    /**
     * Returns true if the message should be printed in the given timestamp,
     * otherwise returns false. If this method returns false, the message will not
     * be printed. The timestamp is in seconds granularity.
     */
    public boolean shouldPrintMessage(int timestamp, String message) {
        //System.out.printf("%s,%s,%s\n",map,timestamp,message);
        if (map.containsKey(message)){
            int old_timestamp = map.get(message);
            if (Math.abs(timestamp-old_timestamp) < 10)
            {
                return false;
            }
            else{
                map.put(message,timestamp);
                return true;    
            }
        }
        else{
            map.put(message,timestamp);
            return true;
        }
    }

    public static void main(String args[])
    {
        LoggerRateLimiter logger = new LoggerRateLimiter();
        // logging string "foo" at timestamp 1
        System.out.printf("%s,%s\n",logger.shouldPrintMessage(1, "foo"),true);

        // logging string "bar" at timestamp 2
        System.out.printf("%s,%s\n",logger.shouldPrintMessage(2,"bar"),true); 

        // logging string "foo" at timestamp 3
        System.out.printf("%s,%s\n",logger.shouldPrintMessage(3,"foo"),false);

        // logging string "bar" at timestamp 8
        System.out.printf("%s,%s\n",logger.shouldPrintMessage(8,"bar"),false); 
        
        // logging string "foo" at timestamp 10
        System.out.printf("%s,%s\n",logger.shouldPrintMessage(10,"foo"),false); 

        // logging string "foo" at timestamp 11
        System.out.printf("%s,%s\n",logger.shouldPrintMessage(11,"foo"),true); 
    }
}