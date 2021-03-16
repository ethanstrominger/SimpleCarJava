Maintain a list of cars and their ID, make, model, and color.
----------------------------------
File 1: Meeting/Agenda
BEFORE MEETING

- Have snack and water on hand before meeting (if will need)
- Ethan: Turn off Slack
- Discuss staying alert (snacks, standing,...)
- Set Ethan's keyboard (for use with Windows remotely)
- Ethan restart computer before meeting (if still having problems after moving it from floor)

AGENDA (during meeting)

Before Starting Project:

- Review:
  (1) Previous Retro 
  (2) TDD steps (see details below)

- Set Timers for
  (1) Mob Timer (https://mobti.me/arrested-egg) (edit Navigator to say "Navigator (Stand)")  
  (2) Agenda Timer(s), e.g., https://www.timeblocks.co/-MVugQnlN9XkoNqc65sx
          Item	       Len	 Start
          Welcome	    5	 9:30 AM
          Review Notes 10	 9:35 AM
          Coding	   25	 9:45 AM
          Retro	        5	10:10 AM
          Coding	   10	10:15 AM
          Break        10	10:25 AM
          Coding	   35	10:35 AM
          Retro+Plan   15	11:10 AM
          Closing	    5	11:25 AM

- Have co-author string ready:
        ``
        Co-authored-by: Ethan Strominger <ethanstrominger@gmail.com>
        or
        Co-authored-by: Joel Silberman <jcsilbermam@gmail.com>
        ``
- Start reviewing this doc within 5 min. of session start time and coding within 10-15 min.
  - Prefer to start with a coding task and get through red-green-refactor (full cycle)
  - Arrange times to talk about outside projects, etc. (e.g., Reach for Help)
  - Be prepared to time how much time we're coding & try to increase

TDD Cycles:

- Requirement - determine the simplest requirement to move forward
- Red - write a failing test
- Green – write the simplest code to pass
- Commit – save to local repository
- Refactor - improve the code without changing or introducing new behavior (or explicitly state if you don't see anything to refactor)
- Commit and Push – save to remote common repository

Agreements (evolve as needed):

- Code by intent – let the tool create classes, variables, etc.
- Bias toward action - let people try things rather than having long debates and speculation; if needed, try it multiple ways and see how it works; always get at least one test done and working at every meeting as a bare minimum (full cycle of red-green-refactor, etc.)
- Retrospectives - after every _30_ minutes on what we learned & liked, and proposed changes (e.g., modifying agreements, processes, etc., as appropriate) (remember to set recurring timer)
- Rotations
  – Rotate roles (driver, navigator, etc.) - after each green (red-green or refactor-commit) up to a max of _5_ minutes
  - Stand every rotation (optionally stand while navigating)
- Breaks – e.g., every _60_ min. (+/-) (remember to set timer)


IntelliJ Shortcuts:

- Double Shift - Search Everywhere in IntelliJ
- Ctrl+K - Commit
- Shift+F10 - Run All (in SimpleCarJava)

End of Session:

- Commit & Push - so everyone has the latest code before leave
----------------------------------
File 2: 
TO DO:
- Switch to JavaScript project (and copy this stuff there):
        - Try hello world new js test in Ethan's existing calendar js project
        - Test 1: I can create a car.
        - Test 1a: When you create a second car, it uses a different id
        - Test 2: I can get a specific car by ID.
        - Test 3: I can get a list of cars that match a specific color.
        - Test 4: I can delete a car by ID.
        - Clean up this document (rename, TOC,...)     
        Future Refactoring:
        - (Ethan) Figure out how to exclude .idea files
        - (Joel) Try opening this project in Visual Studio (may require something different)     
        - (Not Needed / Abandoned - Install ES 6 (Joel's PC) & Resolve GitHub permission issue (Joel - push to Ethan's Simple Car JavaScript - or use Joel's fork))
- Time how much time we're coding & try to increase
- Clean up this document - split into File 1, File 2,... 
- Modify mob timer source code to add "stand" reminder (1) text, (2) text to speech (TTS) 
  [and consider other improvements]
- Add license
- Refactor Java Hashtable loops
----------------------------------
DONE:
- Test 4: I can delete a car by ID.
- Test 3: I can get a list of cars that match a specific color.
- (not a feature) AnyDesk remote control: Compare AnyDesk to Zoom - latency? keyboard?
  *** Do Zoom first, then Any Desk ***
  *** Try copy-paste, etc., speed of typing, highlighting with mouse ***
  *** On first commit: Add Joel as a co-author ***
- Test 2: I can get a specific car by ID.
- Refactor: ID is not currently thread-safe - consider Java UID function
- Test 1a: When you create a second car, it uses a different id
- Test 1: I can create a car.
----------------------------------
File 3: Retro History
RETRO IMPROVEMENTS:
- 3/11/2021:
  - (Some discussion of how to get up and running faster with new JavaScript project; ultimately decided 
    to just use Ethan's existing calendar js project to do our SimpleCar js sample code next time)
- 3/4/2021:
  - Time how much time we're coding & try to increase
  - Later: ideas - modify mob timer to add TTS ("stand" reminder, etc.)
- 2/25/2021
  - Stand every rotation (optionally stand while navigating) 
    (Help manage energy level in meeting)
  - Figure out how Ethan can right-click remotely
  - Ethan: Turn off Slack

- 2/18/2021:
  - Try retros every 30 min (timer loops every 35 min) - even if not coding
  - Ethan have snack and water on hand before meeting
  - Start the project within 5 minutes of session start time. 
      - Prefer to start with a coding task and get through red-green-refactor (full cycle)
      - Arrange times to talk about outside projects, etc. (e.g., Reach for Help)

GOOD / keep doing: 
- 3/11/2021:
  - Started project quickly
  - Used cyber-dojo for sample js test code
  - Set up 3 named timers before meeting (break, retro, wrap-up)
  - Doing setup in which only one person knew what to do, we still switched off but knowledgable driver just said aloud what doing
  - Set within-retro timer for 5 min.
- 3/4/2021:
  - standing (and adding "stand" to the mob timer for navigator)
  - finished Java car project and set up start of JavaScript project, and consolidated into single repository
  - snacks
- 2/25/2021:
    - Snack
    - Notes for what to do at start of meeting
    - Mob timer & switching every 5 min. 
- 2/18/2021:
    - Not using Zoom remote control
    - Using GitHub and typing on own computer
    - AnyDesk (Ethan likes it)
    - Alt-drag mouse works to select vertically in a file
    - Rotate on green (after red-green or after refactor-commit) (mob timer 5 min. as backup max. time)
    - Using google for syntax and taking the simplest one
- 2/4/2021:
    - Added TDD pre-step: Determine the simplest requirement to move forward
    - Got tests done; did TDD (all steps), took turns
    - Discussed expectations in beginning
    - Expected complexity
----------------------------------
