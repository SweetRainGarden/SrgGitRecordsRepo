# SrgGitRecordsRepo - Git Bisect Test Repository

## Overview
The `SrgGitRecordsRepo` serves as a test environment for demonstrating and validating the Automated Git Bisect GitHub Action. It contains a series of commits, including both good and bad ones, to simulate a project with a history of changes where specific commits introduce errors or bugs.

## Purpose
This repository is specifically designed to:
- Provide a realistic commit history for testing the Automated Git Bisect GitHub Action.
- Help users understand how bisecting works in identifying problematic commits.
- Serve as a reference implementation for setting up and running git bisect in a continuous integration workflow.

## Usage
The `SrgGitRecordsRepo` is used as a target repository in the Automated Git Bisect GitHub Action. To test the action, you can specify this repository and its commits as part of the action's input parameters. 

### How to Test with This Repository
1. Go to the GitHub Actions workflow in your repository where the Automated Git Bisect action is set up.
2. Trigger the workflow manually via the `workflow_dispatch` event.
3. When prompted for inputs, use `SweetRainGarden/SrgGitRecordsRepo` for the `org_repo` input.
4. Specify the `init_branch_name`, `good_commit`, and `bad_commit` based on the known history in `SrgGitRecordsRepo`.
5. Run the workflow to see how the Automated Git Bisect action identifies the first bad commit in this repository.

## Repository Structure
- Contains a linear history of commits where certain commits are known to introduce faults intentionally.
- Commit messages or tags in this repository may indicate the nature of the commit (good or bad) to assist in testing the bisect process.

## Contributing
While this repository serves a specific purpose, suggestions for enhancing its utility for git bisect demonstrations are welcome.

## License
This repository is made available under the MIT License.
