Maintain a list of cars and their ID, make, model, and color.

TO DO:
- Figure out how Ethan can right-click remotely
- Test 3: I can get a list of cars that match a certain criteria.
     - NEXT: need to clean up testGetRedCar method
- Test 4: I can delete a car by ID.
- This is a test this is much better
----------------------------------
DONE:
- (not a feature) AnyDesk remote control: Compare AnyDesk to Zoom - latency? keyboard?
  *** Do Zoom first, then Any Desk ***
  *** Try copy-paste, etc., speed of typing, highlighting with mouse ***
  *** On first commit: Add Joel as a co-author ***
- Test 2: I can get a specific car by ID.
- Refactor: ID is not currently thread-safe - consider Java UID function
- Test 1a: When you create a second car, it uses a different id
- Test 1: I can create a car.
----------------------------------
RETRO IMPROVEMENTS:
- 2/25/2021
  - Figure out how Ethan can right-click remotely
  - Ethan: Turn off Slack

- 2/18/2021:
  - Try retros every 30 min (timer loops every 35 min) - even if not coding
  - Ethan have snack and water on hand before meeting
  - Start the project within 5 minutes of session start time. 
      - Prefer to start with a coding task and get through red-green-refactor (full cycle)
      - Arrange times to talk about outside projects, etc. (e.g., Reach for Help)

GOOD / keep doing: 
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
BEFORE MEETING

- Have snack and water on hand before meeting (if will need)
- Ethan: Turn off Slack

AGENDA (during meeting)

Before Starting Project:

- Review: 
  (1) Previous Retro
  (2) TDD steps (see details below) 
  
- Set Timers for
  (1) Retros (recurring)
  (2) Break
  (3) Mob Timer (https://mobti.me/arrested-egg)

- Have co-author string ready:
    Co-authored-by: Ethan Strominger <ethanstrominger@gmail.com> 
    or 
    Co-authored-by: Joel Silberman <jcsilbermam@gmail.com>

- Start the project within 5 minutes of session start time.
    - Prefer to start with a coding task and get through red-green-refactor (full cycle)
    - Arrange times to talk about outside projects, etc. (e.g., Reach for Help)

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
- Rotations – rotate roles (driver, navigator, etc.) - after each green (red-green or refactor-commit) up to a max of _5_ minutes 
- Breaks – e.g., every _60_ min. (+/-) (remember to set timer)


IntelliJ Shortcuts:

- Double Shift - Search Everywhere in IntelliJ
- Ctrl+K - Commit
- Shift+F10 - Run All (in SimpleCarJava)

End of Session:

- Commit & Push - so everyone has the latest code before leave