package de.unisiegen.informatik.bs.alvis.sync.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCString;

public class PCScenario extends PCObject {

	public static final String TYPENAME = "Scenario";

	private PCList<PCThread> threads;
	private PCList<PCThread> threadsRunnable;
	private PCList<PCThread> threadsBlocked;
	private PCList<PCSemaphore> semaphores;
	private PCList<PCInteger> integers;
	private PCList<PCBoolean> booleans;
	private PCList<PCCondition> conditions;
	private PCBuffer buffer;
	private PCString output;

	private Random rndGen;

	private int currentThread;

	private int strategy;

	private boolean deadlocked;
	
	private PCString run;

	public PCScenario() {
		threads = new PCList<PCThread>();
		threadsRunnable = new PCList<PCThread>();
		threadsBlocked = new PCList<PCThread>();
		semaphores = new PCList<PCSemaphore>();
		integers = new PCList<PCInteger>();
		booleans = new PCList<PCBoolean>();
		conditions = new PCList<PCCondition>();
		buffer = new PCBuffer();
		output = new PCString("");
		rndGen = new Random(new Date().getTime());
		currentThread = 0;
		deadlocked = false;
		run = new PCString("");
	}

	public PCScenario(PCList<PCThread> threads, PCList<PCSemaphore> semas,
			PCList<PCInteger> ints, PCList<PCBoolean> bools,
			PCList<PCCondition> conds, PCBoolean buffer, PCBoolean output) {
		this.threads = threads;
		this.semaphores = semas;
		this.integers = ints;
		this.booleans = bools;
		this.conditions = conds;
		if (buffer.getLiteralValue()) {
			this.buffer = new PCBuffer();
		} else {
			this.buffer = null;
		}
		if (output.getLiteralValue()) {
			this.output = new PCString("");
		} else {
			this.output = null;
		}
	}

	public PCScenario(ArrayList<GraphicalRepresentationThread> threads,
			ArrayList<GraphicalRepresentation> primitives,
			ArrayList<GraphicalRepresentationSemaphore> semaphores,
			ArrayList<GraphicalRepresentationCondition> conditions,
			GraphicalRepresentationBuffer buffer) {
		this.threads = new PCList<PCThread>();
		this.threadsRunnable = new PCList<PCThread>();
		this.threadsBlocked = new PCList<PCThread>();
		this.semaphores = new PCList<PCSemaphore>();
		this.integers = new PCList<PCInteger>();
		this.booleans = new PCList<PCBoolean>();
		this.conditions = new PCList<PCCondition>();
		for (GraphicalRepresentationThread grt : threads) {
			PCThread t = new PCThread(grt.getName(), grt);
			this.threads.add(t);
		}
		for (GraphicalRepresentation gr : primitives) {

		}
		for (GraphicalRepresentationSemaphore grs : semaphores) {
			PCSemaphore s = new PCSemaphore(grs.getName(), new PCInteger(grs.getState()), grs);
			this.semaphores.add(s);
		}
		PCSemaphore monitor = new PCSemaphore("Monitor", new PCInteger(1));
		for (GraphicalRepresentationCondition grc : conditions) {
			PCCondition c = new PCCondition(grc.getName(), new PCInteger(grc.getState()),
					monitor, grc);
			this.conditions.add(c);
		}
		if (buffer != null) {

		}
	}

	public PCThread _getThreadByName_(PCString name) {
		for (PCThread t : threads) {
			if (t.getName().equals(name.getLiteralValue())) {
				return t;
			}
		}
		return null;
	}

	public PCSemaphore _getSemaphoreByName_(PCString name) {
		for (PCSemaphore s : semaphores) {
			if (s.getName().equals(name.getLiteralValue())) {
				return s;
			}
		}
		return null;
	}
	
	public PCCondition _getConditionByName_(PCString name) {
		for (PCCondition c : conditions) {
			if (c.getName().equals(name.getLiteralValue())) {
				return c;
			}
		}
		return null;
	}
	
	public PCInteger _getIntegerByName_(PCString name) {
		for (PCInteger i : integers) {
			
		}
		return null;
	}
	
	public PCBoolean _getBooleanByName_(PCString name) {
		for (PCBoolean b : booleans) {
			
		}
		return null;
	}

	public PCThread getThreadFromGraphic(GraphicalRepresentationThread t) {
		if (t == null) {
			return null;
		}
		for (PCThread t2 : threads) {
			if (t2.isGraphical(t)) {
				return t2;
			}
		}
		return null;
	}

	public PCCondition getConditionFromGraphic(
			GraphicalRepresentationCondition c) {
		if (c == null) {
			return null;
		}
		for (PCCondition c2 : conditions) {
			if (c2.isGraphical(c)) {
				return c2;
			}
		}
		return null;
	}

	public PCSemaphore getSemaphoreFromGraphic(
			GraphicalRepresentationSemaphore s) {
		if (s == null) {
			return null;
		}
		for (PCSemaphore s2 : semaphores) {
			if (s2.isGraphical(s)) {
				return s2;
			}
		}
		return null;
	}

	public PCInteger getIntegerFromGraphic(GraphicalRepresentation i) {
		if (i == null) {
			return null;
		}
		for (PCInteger i2 : integers) {
			// if (i2.isGraphical(i)) {
			// return i2;
			// }
		}
		return null;
	}

	public PCBoolean getBooleanFromGraphic(GraphicalRepresentation b) {
		if (b == null) {
			return null;
		}
		for (PCBoolean b2 : booleans) {
			// if (b2.isGraphical(b)) {
			// return b2;
			// }
		}
		return null;
	}

	public static PCScenario getNull() {
		return new PCScenario();
	}

	public static String getTypename() {
		return TYPENAME;
	}

	public PCList<PCThread> _get_Threads_() {
		return threads;
	}

	public void _set_Threads_(PCList<PCThread> threads) {
		this.threads = threads;
	}

	public PCList<PCThread> getThreadsRunnable() {
		return threadsRunnable;
	}

	public void setThreadsRunnable(PCList<PCThread> threadsRunnable) {
		this.threadsRunnable = threadsRunnable;
	}

	public PCList<PCThread> getThreadsBlocked() {
		return threadsBlocked;
	}

	public void setThreadsBlocked(PCList<PCThread> threadsBlocked) {
		this.threadsBlocked = threadsBlocked;
	}

	public PCList<PCSemaphore> _get_Semaphores_() {
		return semaphores;
	}

	public void _set_Semaphores_(PCList<PCSemaphore> semas) {
		this.semaphores = semas;
	}

	public PCList<PCCondition> _get_Conditions_() {
		return conditions;
	}

	public void _set_Conditions_(PCList<PCCondition> conds) {
		this.conditions = conds;
	}

	public PCBuffer _get_Buffer_() {
		return buffer;
	}

	public void _set_Buffer_(PCBuffer buffer) {
		this.buffer = buffer;
	}

	public PCString _get_Output_() {
		return output;
	}

	public void _set_Output_(PCString output) {
		this.output = output;
	}

	public Random getRndGen() {
		return rndGen;
	}

	public void setRndGen(Random rndGen) {
		this.rndGen = rndGen;
	}

	public int getCurrentThread() {
		return currentThread;
	}

	public void setCurrentThread(int currentThread) {
		this.currentThread = currentThread;
	}

	public int getStrategy() {
		return strategy;
	}

	public void setStrategy(int strategy) {
		this.strategy = strategy;
	}

	public boolean isDeadlocked() {
		return deadlocked;
	}

	public void setDeadlocked(boolean deadlocked) {
		this.deadlocked = deadlocked;
	}
	
	public PCList<PCInteger> _get_Integers_() {
		return integers;
	}

	public void _set_Integers_(PCList<PCInteger> integers) {
		this.integers = integers;
	}

	public PCList<PCBoolean> _get_Booleans_() {
		return booleans;
	}

	public void _set_Booleans_(PCList<PCBoolean> booleans) {
		this.booleans = booleans;
	}

	public PCString _get_Run_() {
		return run;
	}

	public void _set_Run_(PCString run) {
		this.run = run;
	}

	@Override
	public void batchModification(boolean setBatchModification) {
		// leaving batch mode, run all delayed commands
		if (isInBatchRun == true && setBatchModification == false) {
			runDelayedCommands();
			for (PCThread t : threads) {
				t.runDelayedCommands();
			}
			for (PCSemaphore s : semaphores) {
				s.runDelayedCommands();
			}
			for (PCCondition c : conditions) {
				c.runDelayedCommands();
			}
			for (PCInteger i : integers) {

			}
			for (PCBoolean b : booleans) {

			}
		}
		isInBatchRun = setBatchModification;
		for (PCThread t : threads) {
			t.batchModification(setBatchModification);
		}
		for (PCSemaphore s : semaphores) {
			s.batchModification(setBatchModification);
		}
		for (PCCondition c : conditions) {
			c.batchModification(setBatchModification);
		}
		for (PCInteger i : integers) {
			i.batchModification(setBatchModification);
		}
		for (PCBoolean b : booleans) {
			b.batchModification(setBatchModification);
		}
	}

	public void addThread(PCThread a) {
		threads.add(a);
		threadsRunnable.add(a);
	}

	public void _step_() {
		deadlocked = true;
		int i, j = 0;
		switch (strategy) {
		case 0: // Random
			PCThread[] running = new PCThread[threads.size()];
			for (i = 0; i < running.length; i++) {
				PCThread t = threads.get(i);
				if (!t.isBlocked().getLiteralValue()) {
					running[j++] = t;
				}
				if (j > 0) {
					running[rndGen.nextInt(j)].step();
					deadlocked = false;
				}
			}
			break;

		case 1: // Round Robin
			// Check if a former blocked thread can run now
			for (PCThread t : threadsBlocked) {
				if (!t.isBlocked().getLiteralValue()) {
					threadsBlocked.remove(t);
					threadsRunnable.add(t);
				}
			}
			// Check if a former runnable thread is blocked now
			for (PCThread t : threadsRunnable) {
				if (t.isBlocked().getLiteralValue()) {
					threadsRunnable.remove(t);
					threadsBlocked.add(t);
				}
			}
			// Get first runnable thread, do step and move to end of list
			if (!threadsRunnable.isEmpty()) {
				PCThread t = threadsRunnable.get(0);
				threadsRunnable.remove(0);
				t.step();
				threadsRunnable.add(t);
				deadlocked = false;
			}
			break;

		case 2: // FIFO
			for (i = 0; i < threads.size(); i++) {
				j = (currentThread + 1) % threads.size();
				PCThread t = threads.get(j);
				if (!t.isBlocked().getLiteralValue()) {
					t.step();
					deadlocked = false;
					break;
				}
			}
			currentThread = j;
			break;

		case 3: // Prio
			for (i = 0; i < threads.size(); i++) {
				PCThread t = threads.get(i);
				if (!t.isBlocked().getLiteralValue()) {
					t.step();
					deadlocked = false;
					break;
				}
			}
			break;

		case 4: // rev. Prio
			for (i = threads.size() - 1; i >= 0; i--) {
				PCThread t = threads.get(i);
				if (!t.isBlocked().getLiteralValue()) {
					t.step();
					deadlocked = false;
					break;
				}
			}
			break;
		}
		if (deadlocked) {

		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(PCObject toCheckAgainst) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getMembers() {
		String[] members = { "threads", "semaphores", "conditions", "buffer",
				"integers", "booleans", "buffer" };
		return Arrays.asList(members);
	}

	@Override
	public HashMap<String, String> getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PCObject set(String memberName, PCObject value) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getMethods() {
		String[] methods = { "step", "getThreadByName", "getSemaphoreByName",
				"getConditionByName", "getPrimitiveByName" };
		return Arrays.asList(methods);
	}

}
