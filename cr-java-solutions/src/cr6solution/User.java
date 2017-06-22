/*
 * Queues
 * Queues are often spoken about in relation to concurrency (indeed, most of the Java implementations live in 
 * java.util.concurrent), as it’s a common way to pass data between threads or modules.
 * Queues are FIFO data structures, generally working well when you want to add elements to the tail of the queue, 
 * or remove things from the front of the queue. If you’re reviewing code that shows iteration over a queue 
 * (in particularly accessing elements in the middle of the queue), question if this is the correct data type.
 * Queues can be bounded or unbounded. Unbounded queues could potentially grow forever.
 * Bounded queues can come with their own problems too – when reviewing code, you should look for the conditions 
 * under which the queue might become full, and ask what happens to the system under these circumstances.
 */

package cr6solution;

public class User {

}
