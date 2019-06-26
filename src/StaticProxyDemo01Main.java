
public class StaticProxyDemo01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuyHouse buyHouse=new BuyHouseImp();
		BuyHouseProxy proxy=new BuyHouseProxy(buyHouse);
		proxy.buyHouse();
	}

}
