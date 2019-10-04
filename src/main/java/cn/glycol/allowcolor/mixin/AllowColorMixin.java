package cn.glycol.allowcolor.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.SharedConstants;

@Mixin(SharedConstants.class)
public class AllowColorMixin {
	
	/**
	 * Rewrite the check method to allow the '§'.
	 * 
	 * @reason To allow the '§' char.
	 * @author Taskeren
	 */
	@Overwrite
	public static boolean isValidChar(char c) {
		return true;
	}
	
}
