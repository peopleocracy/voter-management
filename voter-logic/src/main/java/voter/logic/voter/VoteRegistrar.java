package voter.logic.voter;

import static voter.data.VoterDAO.create;
import vote.core.model.Voter;
import voter.exception.VoterRegistrationException;

public class VoteRegistrar {


	public Voter registerVoter(final Voter voter) throws VoterRegistrationException {
		if (voterExists(voter)) {
			throw new VoterRegistrationException("A voter with ID "
					+ voter.getVoterId() + " already exists");
		}

		return create(voter);
	}

	public boolean voterExists(Voter voter) {
		// TODO Auto-generated method stub
		return false;
	}
}
