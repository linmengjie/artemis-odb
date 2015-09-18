package com.artemis.system;

import com.artemis.NullProfiler;
import com.artemis.annotations.Profile;

@Profile(enabled=false, using=NullProfiler.class)
public class BeginEndSystem extends VoidEntitySystem {
	@Override
	protected void processSystem() {}
	
	@Override
	protected void begin() {}
	
	@Override
	protected void end() {}
}
