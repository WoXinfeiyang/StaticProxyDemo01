
public class BuyHouseProxy implements BuyHouse {
	/**被代理对象*/
	private BuyHouse mBuyHouse;
	
	
	
	public BuyHouseProxy(BuyHouse mBuyHouse) {
		this.mBuyHouse = mBuyHouse;
	}



	@Override
	public void buyHouse() {
		System.out.println("买房前准备……");
		this.mBuyHouse.buyHouse();
		System.out.println("买房子后的装修");
	}
	
	
}
