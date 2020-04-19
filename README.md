# datadaeri2
datadaeri2

### Data 
## 공통 attributes
- id : String  
- userId : String  
- quality : int  
- date : String  
- task : String  
- subTask : String  

## NLP Task attributes
# paraphrase 
- paraphraseClass : String  
- paraphrase : string  

# translation Data
- sourceLang : String  
- targetLang : String  
- sourceText : String  
- targetText : String

### API
- get /translationData  
- post /translationData  
	- form : application/json  
	- body :{"sourceLang":"kr", "targetLang":"en", "sourceText":"내일 봐요", "targetText":"see you tomorrow"}  
- get /paraphraseData  
- post /paraphraseData  
	- form : application/json  
	- body : {"paraphraseClass":"1", "paraphrase":"에어컨 안시원해"}  

### DB
data
