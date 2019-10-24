# Example Data from <https://developer.ucsb.edu/content/academic-curriculums>


# `fall2019_cmpsc.json`

Retrieved via this command.  Note that `PUT-KEY-HERE` must be replaced with an actual key.   

```
curl -X GET "https://api.ucsb.edu/academics/curriculums/v1/classes/search?quarter=20194&subjectCode=CMPSC&pageNumber=1&pageSize=100&includeClassSections=true" -H "accept: application/json" -H "ucsb-api-version: 1.0" -H "ucsb-api-key: PUT-KEY-HERE" > fall2019_cmpsc.json
```

This file contains data for 51 courses.

# `fall2019_math4b.json`

```
curl -X GET "https://api.ucsb.edu/academics/curriculums/v1/classes/search?quarter=20194&courseId=MATH%204B&pageNumber=1&pageSize=100&includeClassSections=true" -H "accept: application/json" -H "ucsb-api-version: 1.0" -H "ucsb-api-key: PUT-KEY-HERE" > fall2019_math4b.json
```
