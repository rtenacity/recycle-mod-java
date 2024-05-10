package net.mcreator.recyclemod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.recyclemod.network.RecyclemodModVariables;

public class SetQuestionProcedure {
	public static void execute(LevelAccessor world) {
		if (RecyclemodModVariables.MapVariables.get(world).round == 1) {
			RecyclemodModVariables.MapVariables.get(world).question = "What is meant by the expression Going Green?";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) Becoming more environmentally aware";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) Reducing the amount of pollution and waste you create";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) Planting a tree";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "D) All of the above";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "d";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 2) {
			RecyclemodModVariables.MapVariables.get(world).question = "How does recycling impact the economy of the United States in terms of jobs?";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) 681,000 jobs (0.50% of U.S. economy) in 2023";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) 553,000 jobs (0.40 % of U.S. economy) in 2023";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) 1,150,000 jobs (0.90 % of U.S. economy) in 2023";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "D) 1,540,000 jobs (1.5 % of U.S. economy) in 2023";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "a";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 3) {
			RecyclemodModVariables.MapVariables.get(world).question = "How does recycling impact the economy of the United States in terms of wages?";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) $37.8 billion dollars (~.60 % of the U.S. economy)";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) $50.8 billion dollars (~.80 % of the U.S. economy)";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) $25.8 billion dollars (~.40 % of the U.S. economy)";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "D) $15.8 billion dollars (~.30 % of the U.S. economy)";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "a";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 4) {
			RecyclemodModVariables.MapVariables.get(world).question = "Which of the following are some emerging innovations in recycling?";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) Throwing Remy in the dumpster";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) Nuclear fission energy for decomposing";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) Pyrolysis (waste \u2192 fuel)";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "D) Putting all recycling into landfills along with trash";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "c";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 5) {
			RecyclemodModVariables.MapVariables.get(world).question = "What materials can you NOT recycle?";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) thermoset plastics";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) styrofoam";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) food waste";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "D) glass bottle";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "a";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 6) {
			RecyclemodModVariables.MapVariables.get(world).question = "What types of wood can be recycled?";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) pressure-treated wood";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) painted wood";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) plywood with glue";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "D) rotting wood";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "a";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 7) {
			RecyclemodModVariables.MapVariables.get(world).question = "What is an easy way to encourage recycling within your community?";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) Composting";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) Keeping clearly labeled bins";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) Hosting a recycling drive in a local park";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "D) All of the above";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "d";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 8) {
			RecyclemodModVariables.MapVariables.get(world).question = "True or false: It is usually safe for plastic bags to go in recycling bins.";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) True";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) False";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "b";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 9) {
			RecyclemodModVariables.MapVariables.get(world).question = "What happens to recyclables after they are put into bins? ";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) They are sent to a recycling center to be further sorted";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) They are sent to a landfill, then sorted and brought to a recycling center";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) They are sent to a waste management center";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "D) Recyclables are immediately treated with a decomposing enzyme";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "a";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
		if (RecyclemodModVariables.MapVariables.get(world).round == 10) {
			RecyclemodModVariables.MapVariables.get(world).question = "True or False: Recyclables must be treated before they are used again.";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceA = "A) True";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceB = "B) False";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).chioiceC = "";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).choiceD = "";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
			RecyclemodModVariables.MapVariables.get(world).correctAnswer = "a";
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
