package com.test.object;

public class Box {
	
	    private Macaron[] list = new Macaron[10];

	    public void cook() {
	    	
	    	for (;;) {
	    		
	    		list[0] = new Macaron();
	    		
	    		String[] c1 = {"red","blue","yellow","white","pink","purple","green"};
	    		
	    		list[0].setColor(c1[(int)(Math.random() * c1.length)]);
	    		list[0].setSize(15);
	    		
	    	}
	    	

	    	
	    	
	    }
	    
	    public void check() {
	    	
	    	for (;;) {
	    		
	    		list[0].getColor();
	    		list[0].getSize();
	    		list[0].getThickness();
	    		
	    		
	    	}
	    	
	    	
	    	
	    	
	    }
	    
	    public void list() {
	    	
	    	for (;;) {
	    		
	    		list[0].getColor();
	    		list[0].getSize();
	    		list[0].getThickness();
	    		
	    		
	    	}
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	}

