package com.skb.stat;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skb.stat.model.Stats;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/stats") // This means URL's start with /demo (after
									// Application path)
public class StatsController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private StatsRepository statsRepository;
	
	@PostMapping(path="/upload_one") // Map ONLY GET Requests
	public @ResponseBody String uploadOne (@RequestBody Stats reqStats
			, @RequestHeader HttpHeaders headers) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		System.out.println("upload_one:" + reqStats.toString());
		statsRepository.save(reqStats);
		JSONObject json = new JSONObject();
		try {
			json.put("rtn", 0);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json.toString();
	}
}
