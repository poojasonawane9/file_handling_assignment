package com.capgemini.test;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.Test;
import com.capgemini.main.EmployeeClass;
import com.capgemini.main.EmployeeSerializable;

public class EmployeeSerializableTest {

	@Test
	public void testEmplyeeSerialization() throws IOException {
		
		EmployeeClass employee = new EmployeeClass(1,"bob",20000);
		EmployeeSerializable employeeSerializable = new EmployeeSerializable();
		assertTrue(employeeSerializable.serialization("employee.ser",employee));
		
	}

}
