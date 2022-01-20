package com.placement.service;

import com.placement.entities.College;

public interface CollegeService {
public void addCollege(College c);
public College getCollege(int id);
public void updateCollege(College c);
public void deleteCollege(int id);

public College getCollegeById(int id);
}
