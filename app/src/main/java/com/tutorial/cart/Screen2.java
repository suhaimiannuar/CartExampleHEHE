package com.tutorial.cart;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Screen2 extends Activity{

	int totalHarga;


	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen2);


		 
	    TextView showCartContent = (TextView)findViewById(R.id.showcart);
		TextView harga = (TextView)findViewById(R.id.totalprice);
	
		
		final Controller ct = (Controller)getApplicationContext();
		
		final int CartSize = ct.getCart().getCartsize();
		
		String show = "";
		
               for(int i=0;i<CartSize;i++){
				 
				String pName = ct.getCart().getProducts(i).getProductName(); 
				 
			    int  pPrice = ct.getCart().getProducts(i).getProductPrice();

				totalHarga = pPrice + totalHarga;
				
			    String pDisc = ct.getCart().getProducts(i).getProductDesc(); 
				 
				 
			  show += "Product Name:"+pName+" "+"Price : "+pPrice+""+"Discription : "+pDisc+""+    
	                    "-----------------------------------";
				 
				 
				 
			 }

		String tukar = Integer.toString(totalHarga);
		harga.setText(tukar);
		
		showCartContent.setText(show);
		
		
		
	}
	
	 
	
	

}
