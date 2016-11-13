/*
 * Semaphore.java
 *
 * Created on 8. kvìten 2007, 14:45
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Duck911
 */
public class Semaphore {

    /** Creates a new instance of Semaphore */
    int counter;
    int maxThread;
    public Semaphore(int mT) {
        counter=0;
        maxThread=mT;

    }

    public boolean available()
    {
        return counter < maxThread;
    }

    public void acquire()
    {
        if(available())
        {
            ++counter;
        }
        else
        {
            try{
                wait();
                acquire();
            }
            catch(InterruptedException e)
            {System.out.println("Thread was interrupted during the wait
maethod.");}
        }

    }

    public void release()
    {
        try{
            if(--counter < 0) throw new Exception();
            else
            {
                notify();
            }
        }
        catch(Exception e)
        {
            System.err.println("Problem with semaphore release,value smaller
than zero");
        }
    }
}
