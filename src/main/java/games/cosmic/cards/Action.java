package games.cosmic.cards;

public class Action {
    /*
    Nahuel, my thought process for this class is that each CosmicCard has an action that it preforms.
    Encounter cards attack, morphs copy, negotiates negotiate or lose, and flares have an ability.

    With the current setup, I want a way to return the action of a card independent of the type.
    I want to be able to have a CosmicCard object, whether it be an Encounter card, a Reinforcement card, a Flare, or an
    Artifact, and be able to call card.getAction() and get back an object that can give me a description of what this
    card does, that way, whenever a player plays a card, no matter when they place it as some cards can be played during
    any phase, we have an object that knows what the card can do and we can implement a way to do it.

    I like this better then having a getAttack method for encounter cards and a getWhatever for flares because
    to be able to call the method, it needs to exist in CosmicCard, and all children have access to those methods.

    calling flareCard.getAttack() makes no sense and calling reinforcementCard.getWhatever also makes no sense.

     */
}
