
public class BuyHouseProxy implements BuyHouse {
	/**���������*/
	private BuyHouse mBuyHouse;
	
	
	
	public BuyHouseProxy(BuyHouse mBuyHouse) {
		this.mBuyHouse = mBuyHouse;
	}



	@Override
	public void buyHouse() {
		System.out.println("��ǰ׼������");
		this.mBuyHouse.buyHouse();
		System.out.println("���Ӻ��װ��");
	}
	
	
}
