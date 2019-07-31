package com.tyss.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernate.dto.ProductBean;
import com.tyss.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ProductRestriction {

	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();

		Criteria criteria = session.createCriteria(ProductBean.class);
		Criterion criterion = Restrictions.lt("price", 100);
		Criterion criterion2=Restrictions.like("product", "A%");
		criteria.add(criterion);
		criteria.add(criterion2);

		List<ProductBean> cr = criteria.list();

		for (ProductBean productBean : cr) {
			log.info("result" + productBean.toString());
		}
	}
}
