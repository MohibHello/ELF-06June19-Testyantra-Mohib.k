package com.testyantra.assignment.strings;

public class ProductTest {

	public static void main(String[] args) {

		ProductBean p1 = new ProductBean();
		p1.setId(101);
		p1.setType("mobile");
		p1.setQuality("first");
		p1.setPrice(20000);

		ProductBean p2 = new ProductBean();
		p2.setId(102);
		p2.setType("car");
		p2.setQuality("third");
		p2.setPrice(90000);

		ProductBean p3 = new ProductBean();
		p3.setId(103);
		p3.setType("radio");
		p3.setQuality("second");
		p3.setPrice(24000);

		ProductBean p4 = new ProductBean();
		p4.setId(104);
		p4.setType("TV");
		p4.setQuality("first");
		p4.setPrice(44000);

		ProductBean[] pb = new ProductBean[4];
		pb[0] = p1;
		pb[1] = p2;
		pb[2] = p3;
		pb[3] = p4;

		for (int i = 0; i < pb.length; i++) {
			ProductBean p = pb[i];
			System.out.println("ID : " + p.getId());
			System.out.println("Type : " + p.getPrice());
			System.out.println("Quality : " + p.getQuality());
			System.out.println("Price : " + p.getPrice());
		}

	}
}
