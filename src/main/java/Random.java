import org.apache.log4j.Logger;

public class Random {

    private static final Logger log = Logger.getLogger(Random.class);

    public void getRandomNumber() throws MyException {

        int randomNumber = (int) (Math.random()*10);
        if (randomNumber <5){
            log.info(" Generated Number – " + randomNumber + ".");
            throw new MyException(" Generated Number – " + randomNumber + ".");
            //log
        } else {
            System.out.println(" App Started!");
            //log
            log.error(" App Started!");
        }
    }


}
