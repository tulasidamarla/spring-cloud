package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dao.NounClient;
import com.learning.dao.WordDao;

@Service
public class SentenceServiceImpl implements SentenceService {

	//private WordDao verbService;
	//private WordDao subjectService;
	//private WordDao articleService;
	//private WordDao adjectiveService;
	//private WordDao nounService;
	//@Autowired
	//private NounClient nounService;
	

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	/*public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence =  
			String.format("%s %s %s %s %s.",
				subjectService.getWord(),
				verbService.getWord(),
				articleService.getWord(),
				adjectiveService.getWord(),
				nounService.getWord() );
		return sentence;
	}


	@Autowired
	public void setVerbService(WordDao verbService) {
		this.verbService = verbService;
	}

	@Autowired
	public void setSubjectService(WordDao subjectService) {
		this.subjectService = subjectService;
	}

	@Autowired
	public void setArticleService(WordDao articleService) {
		this.articleService = articleService;
	}

	@Autowired
	public void setAdjectiveService(WordDao adjectiveService) {
		this.adjectiveService = adjectiveService;
	}*/

	/*@Autowired
	public void setNounService(WordDao nounService) {
		this.nounService = nounService;
	}*/
	
	@Autowired WordService wordService;
	

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		return  
			String.format("%s %s %s %s %s.",
				wordService.getSubject(),
				wordService.getVerb(),
				wordService.getArticle(),
				wordService.getAdjective(),
				wordService.getNoun())
			;
	}

	
}
