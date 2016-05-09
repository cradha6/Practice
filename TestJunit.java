import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test(timeout=1000)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessage();     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
      assertEquals(message,messageUtil.printMessage());
   }
}
   
//	@Test
//   public void manualResponseTimeCheck() throws InterruptedException {
//		final HighScoreService realHighScoreService = new StubHighScoreService();
//   final Game gameUnderTest = new Game(realHighScoreService);
//   final CountDownLatch latch = new CountDownLatch(1); final List<Throwable> exceptions = new ArrayList<>();
//   final Runnable highScoreRunnable = new Runnable() { @Override
//   public void run() {
//   final String highScoreDisplay =
//   gameUnderTest.displayHighScores(); try {
//   assertNotNull(highScoreDisplay); } catch (Throwable e) {
//   exceptions.add(e); }
//   latch.countDown(); }
//   };
//   new Thread(highScoreRunnable).start(); assertTrue(latch.await(1, TimeUnit.SECONDS));
//   if(!exceptions.isEmpty()) {
//   fail("Exceptions thrown in different thread: " + exceptions);
//   } 
//   }
//   
//}
//
//class HighScoreService {
//	
//}
//class Stub
