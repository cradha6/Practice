//public class Singleton implements Cloneable{
//
//	private static Singleton singletonObj = null;
//	public String str = "Hello World";
//	
//	private void Singleton(){
//		
//		
//	}
//	
//	public static Singleton getInstance(str){
//		
//		synchronized (singletonObj) {
//			if (null != singletonObj){
//				return singletonObj;
//			}else{
//				singletonObj = new Singleton();
//				return singletonObj;
//			}
//			
//		}
//	}
//	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return singletonObj;
//	}
//	
//
//}
