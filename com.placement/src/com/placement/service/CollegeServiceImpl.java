package com.placement.service;

import com.placement.Dao.CollegeDao;
import com.placement.Dao.CollegeDaoImpl;
import com.placement.entities.College;

public class CollegeServiceImpl implements CollegeService {
	CollegeDao cd;
	public CollegeServiceImpl()
	{
		cd=new CollegeDaoImpl();
	}
	
	@Override
	public void addCollege(College c) {
		cd.startTransaction();
		cd.addCollege(c);
		cd.endTransaction();
		
	}

	@Override
	public College getCollege(int id) {
		College c=getCollege(id);
		return c;
	}

	@Override
	public void updateCollege(College c) {
		cd.startTransaction();
		cd.updateCollege(c);
		cd.endTransaction();
	}

	@Override
	public void deleteCollege(int id) {
		cd.startTransaction();
		cd.deleteCollege(id);
		cd.endTransaction();
		
	}

	@Override
	public College getCollegeById(int id) {
		
		return cd.getCollegeById(id);
	}

}
