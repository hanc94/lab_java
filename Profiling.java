import java.lang.management.*;
import java.lang.System;

public class Profiling {
	
	/** Get CPU time in nanoseconds. */
	public static long getCpuTime( ) {
	    ThreadMXBean bean = ManagementFactory.getThreadMXBean( );
	    return bean.isCurrentThreadCpuTimeSupported( ) ?
	        bean.getCurrentThreadCpuTime( ) : 0L;
	}
	
	/** Get Wall time in nanoseconds. */
	public static long getWallTime(){		
		return System.nanoTime();		
	}
}
