//Test basic functions of a television
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv=new Television();
		
		tv.setState(true);  //turn the television on
		System.out.println("Television is turned "+tv.isState());
		
		tv.setVolume(15);   //Set initial television volume
		System.out.println("Initial television volume is "+tv.getVolume());
		
		tv.increaseVolume(); //Increase television volume
		System.out.println("Television volume is "+tv.getVolume());
		
		tv.decreaseVolume(); //Decrease television volume
		System.out.println("Television volume is "+tv.getVolume());
		
		System.out.println("Default television channel is "+tv.getChannel());  //Display default channel
		System.out.println("Changing the channel...");
		
		tv.changeChannel(250);  //Change television channel
		System.out.println("Television channel is "+tv.getChannel());
		
		tv.setState(false);  //Turn the television off
		System.out.println("Television is turned "+tv.isState());

	}

}
