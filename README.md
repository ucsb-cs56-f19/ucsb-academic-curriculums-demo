# ucsb-academic-curriculums-demo

A demo of getting data from UCSB Academic Curriclums API documented at <https://developer.ucsb.edu>

Note that *you don't necessarily need to already have api access* to run some of the code in this repo.

# Example Data

The directory `data` in this repo contains sample JSON data from the API that can be used to test code that reads and processes the JSON data without needing API access.   The README.md in that directory has more information about that data and how it was generated.

That data consists of files containing JSON returned by various API calls.  You can read data from those files into Java programs and then experiment with converting that JSON into Java Objects to do computations with.

# Moving beyond the example data

Once you understand how to work with the example data files, it's time to move on to working with direct API access.
At that point:

* You can generate new files of data. 
* You can read from the API directly, and not have to deal with JSON files.

# Background

The site <https://developer.ucsb.edu> provides API access to various kinds of UCSB data, with proper authentication and authorization.

Some data is easier to get at, because access is "automatically approved".  This includes data that is essentially already available to the public through websites as text or formatted HTML, although not necessariy in machine readable form such as CSV files or JSON.    This includes:
* Data about the UCSB Academic Calendar
   * That data is generally available to the public on this website: <https://registrar.sa.ucsb.edu/calendars/calendars-deadlines/academic-calendars/academic-calendar-menu>
   * The API access is documented here: <https://developer.ucsb.edu/content/academic-quarter-calendar>
* Data about the UCSB Academic Curriculum
   * That data is generally available to the public on this website: <https://my.sa.ucsb.edu/public/curriculum/coursesearch.aspx>
   * The API access is documented here: <https://developer.ucsb.edu/content/academic-curriculums>


# What do you need to get data from the site directly

To get data directly from the API, you need to:

* Register on the site
* Create an "application" and indicate which APIs that application will need to access 
* Get the api access key for that application, a "secret" value that you pass in every request for information

# Why are API keys needed for data that is public anyway?

It is a resaonably standard practice to protect APIs with some form of api access key, even for generally available data. 

The api access key allows the UCSB staff that maintain the API access to track and monitor usage, so that they can be sure that the site remains reliable.  In general, uncontrolled access to APIs can present certain security risk&mdash;for example, in the form of denial of service attacks.  Using API keys helps to control that.

# How do I get data from the API and store it into a file

Once you have an API Key, you can use the tool at <https://developer.ucsb.edu/content/academic-curriculums> to build queries.   The queries can then be run directly in the tool.  

You can also copy and paste a `curl` command that can be run at the command line on any system with `curl` installed.    The output of that command can be redirected into a file with the Unix `> filename.json` notation.




