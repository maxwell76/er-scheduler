public class RadioCallInShow {

    public static void main(String[] args) {
       LinkedQueue phoneline = new LinkedQueue();
        System.out.println("The lines are open");
        System.out.println("Currently we have "+phoneline.size()+" callers waiting...");
        System.out.println("3 calls are coming in");
        phoneline.enqueue(new Caller("Jim"));
        phoneline.enqueue(new Caller("Amy"));
        phoneline.enqueue(new Caller("Susan"));
        System.out.println("The next caller will be: "+phoneline.peekFront());
        System.out.println("We are now talking with "+phoneline.dequeue());
        System.out.println("Currently we have "+phoneline.size()+" callers waiting...");
        System.out.println("2 more ppl have called in and are on hold...");
        phoneline.enqueue(new Caller("Josh"));
        phoneline.enqueue(new Caller("Sara"));
        System.out.println("Lets take the next call - this is: "+phoneline.dequeue());
        System.out.println("We've run out of time, lets clear the lines and say a quick hi to everyone");
        while(phoneline.size()>0){
            System.out.println("Hello "+phoneline.dequeue()+" thanks for calling");
        }
        System.out.println("Currently we have "+phoneline.size()+" callers waiting...");
        
    }
    
}
