package work.yk0.townwalker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TownwalkerApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void Bootが立ち上がりhomeが正しく表示されること() throws Exception{
		this.mockMvc.perform(get("/")).andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("予測不可能driving")));
	}

	@Test
	public void Bootが立ち上がりmapが正しく表示されること() throws Exception{
		this.mockMvc.perform(get("/map")).andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("設置場所")));
	}

}
