package com.placement.Dao;

import java.util.List;

import com.placement.entities.College;

public interface CollegeDao {
public void addCollege(College c);
public College getCollege(int id);
public void updateCollege(College c);
public void deleteCollege(int id);

public College getCollegeById(int id);

public void startTransaction();
public void endTransaction();
}
