package test.json;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.junit.Test;

public class TestJson {
	@Test
	public void jsonPropertyTest() throws Exception {
		TestPOJO testPOJO = new TestPOJO();
		testPOJO.wahaha(111);
		testPOJO.setFirstName("myName");
		TestPOJO2 testPOJO2 = new TestPOJO2();
		testPOJO2.wahaha(111);
		testPOJO2.setFirstName("myName");
		// testPOJO.setTestPOJO2(testPOJO2);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper
				.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
		String jsonStr = objectMapper.writeValueAsString(testPOJO);
		System.out.println(jsonStr);
	    testPOJO.setTestPOJO2(testPOJO2);
		objectMapper
				.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
		System.out.println(objectMapper.writeValueAsString(testPOJO));
	}

	public static class TestPOJO {
		@JsonProperty
		// 注意这里必须得有该注解，因为没有提供对应的getId和setId函数，而是其他的getter和setter，防止遗漏该属性
		private int id;
		@JsonProperty("first_name")
		private String firstName;
		@JsonProperty("test_pojo2")
		private TestPOJO2 testPOJO2;

		public int wahaha() {
			return id;
		}

		public void wahaha(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public TestPOJO2 getTestPOJO2() {
			return testPOJO2;
		}

		public void setTestPOJO2(TestPOJO2 testPOJO2) {
			this.testPOJO2 = testPOJO2;
		}

	}

	public static class TestPOJO2 {
		@JsonProperty
		// 注意这里必须得有该注解，因为没有提供对应的getId和setId函数，而是其他的getter和setter，防止遗漏该属性
		private int id;
		@JsonProperty("first_name")
		private String firstName;

		public int wahaha() {
			return id;
		}

		public void wahaha(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	}
}
